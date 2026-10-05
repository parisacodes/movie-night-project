import { useEffect, useState } from 'react'

type Movie = {
  title: string
  year: number
  genre: string
}

function App() {
  const [loading, setLoading] = useState(true)
  const [error, setError] = useState('')
  const [movies, setMovies] = useState<Movie[]>([])
  useEffect(() => {
    async function fetchMovies() {
      try {
        const response = await fetch('http://localhost:8080/api/movies')
        if (!response.ok) {
          throw new Error(`HTTP error: ${response.status}`)
        }
        const data = await response.json()
        setMovies(data)
      } catch (error) {
        console.error(error)
        setError('Could not connect to the server.')
      } finally {
        setLoading(false)
      }
        
    }

    fetchMovies()
  }, [])
  return (
    <>
      <h1>Movie Night</h1>
      {loading
        ? <p>Loading...</p>
        : error
          ? <p>{error}</p>
          : movies.map(movie => (
              <p key={movie.title}>{movie.title}, {movie.year}, {movie.genre}</p>
          ))
      }
    </>
  )
}

export default App

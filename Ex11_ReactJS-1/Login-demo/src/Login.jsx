import {useState } from 'react'; 
import PropTypes from 'prop-types';

const Login = ({ onLogin }) => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    // Kiểm tra username và password
    if (username === 'admin' && password === 'password') {
      onLogin(username);
    } else {
      setError('Username/password không đúng');
    }
  };

  return (
    <div>
      <h2>Login</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Username:</label>
          <input 
            type="text" 
            value={username} 
            onChange={(e) => setUsername(e.target.value)} 
          />
        </div>
        <div>
          <label>Password:</label>
          <input 
            type="password" 
            value={password} 
            onChange={(e) => setPassword(e.target.value)} 
          />
        </div>
        {error && <div style={{color: 'red'}}>{error}</div>}
        <button type="submit">Login</button>
      </form>
    </div>
  );
};

Login.propTypes = {
    onLogin: PropTypes.func.isRequired
};

export default Login;

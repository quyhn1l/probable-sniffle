import PropTypes from 'prop-types';
const Dashboard = ({ username }) => {
  return (
    <div>
      <h2>Dashboard</h2>
      <p>Chào {username}</p>
    </div>
  );
};

Dashboard.propTypes = {
    username: PropTypes.string.isRequired,
  };

  export default Dashboard;

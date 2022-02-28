// Call the dataTables jQuery plugin
$(document).ready(function() {
	alert('Todo funciona correctamente');
  findUser();
  $('#usersTable').DataTable();
});

async function findUser() {
  const response = await fetch('users/123', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
  const user = await response.json();

  console.log(user);
}

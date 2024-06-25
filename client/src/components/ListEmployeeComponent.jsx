const ListEmployeeComponent = () => {
  const dummyData = [
    {
      id: 1,
      firstName: "Kane",
      lastName: "Norton",
      email: "knorton@gmail.com",
    },
    {
      id: 2,
      firstName: "Jane",
      lastName: "Doe",
      email: "jdoe@gmail.com",
    },
    {
      id: 3,
      firstName: "John",
      lastName: "Smith",
      email: "jsmith@gmail.com",
    },
    {
      id: 4,
      firstName: "Emily",
      lastName: "Brown",
      email: "ebrown@gmail.com",
    },
    {
      id: 5,
      firstName: "Michael",
      lastName: "Johnson",
      email: "mjohnson@gmail.com",
    },
  ];

  return (
    <div className="container">
      <h2 className="text-center">List of Employees</h2>
      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          {dummyData.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.firstName}</td>
              <td>{employee.lastName}</td>
              <td>{employee.email}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListEmployeeComponent;

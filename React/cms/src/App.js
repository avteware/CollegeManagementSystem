import logo from './logo.svg';
import './App.css';
import Header from './Component/Header';
import{Button, Col, Container, Row} from "reactstrap";
import {ToastContainer,toast } from "react-toastify";
import Course from './Component/Course';
import AllCourses from './Component/AllCourses';
import Home from './Component/Home';
import AddCourse from './Component/AddCourse';
import Menu from './Component/Menu';
import {BrowserRouter as Router,Route, Routes,Link, BrowserRouter} from "react-router-dom";
import AddStudent from './Component/AddStudent';
import AllStudent from './Component/AllStudent';
import AddSubject from './Component/AddSubject';
import AllSubject from './Component/AllSubject';
import AddFaculty from './Component/AddFaculty';
import AllFaculty from './Component/AllFaculty';
import AddReportCard from './Component/AddReportCard';
import AllReportCard from './Component/AllReportCard';
import AddAttendance from './Component/AddAttendance';
import AllAttendance from './Component/AllAttendance';
import AddExam from './Component/AddExam';
import AllExam from './Component/AllExam';


function App() {
  const btnHandle=()=>{toast("abcd");};
  return (
   <div> 
  
<BrowserRouter> 
    <ToastContainer/>
    <Container>
    <Header/>
    <Row>
        <Col md={4}>
          
        
         
    <Link className="list-group-item list-group-item-action" tag="a" to="/" action>Home</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-course" action>Add Course</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-course" action>View All Courses</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-student" action>Add Student</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-student" action>View All  Student</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-subject" action>Add Subject</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-subject" action>View All  Subject</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-faculty" action>Add Faculty</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-faculty" action>View All Faculty</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-exam" action>Add Exam</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-exam" action>View Exam</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-reportCard" action>Add Report Card</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-reportCard" action>View All Report Card</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/add-attendance" action>Add Attendance</Link> <br></br>
    <Link className="list-group-item list-group-item-action" tag="a" to="/view-attendance" action>View Attendance</Link> <br></br>




    </Col>
    <Col md={8}>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/add-course" element={<AddCourse/>}></Route>
        <Route path="/view-course" element={<AllCourses/>}></Route>
        <Route path="/add-student" element={<AddStudent/>}></Route>
        <Route path="/view-student" element={<AllStudent/>}></Route>
        <Route path="/add-subject" element={<AddSubject/>}></Route>
        <Route path="/view-subject" element={<AllSubject/>}></Route>
        <Route path="/add-faculty" element={<AddFaculty/>}></Route>
        <Route path="/view-faculty" element={<AllFaculty/>}></Route>
        <Route path="/add-exam" element={<AddExam/>}></Route>
        <Route path="/view-exam" element={<AllExam/>}></Route>
         <Route path="/add-reportCard" element={<AddReportCard/>}></Route>
        <Route path="/view-reportCard" element={<AllReportCard/>}></Route>
        <Route path="/add-attendance" element={<AddAttendance/>}></Route>
        <Route path="/view-attendance" element={<AllAttendance/>}></Route>


        
      </Routes>
      </Col>
       </Row>
     </Container>
    </BrowserRouter >

   </div>
  );
}

export default App;

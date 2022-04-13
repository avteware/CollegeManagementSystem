import React from "react";
import { Link } from "react-router-dom";
import { ListGroup, ListGroupItem } from "reactstrap";

const Menu=()=>{
    return(
        <ListGroup>
            <Link tag='a' to="/" action>
                Home
            </Link>
            <Link tag='a' to="/add-course" action>
                Add Course
            </Link>
            <Link tag='a' to="/view-course" action>
                View Course
            </Link>
            <Link tag='a' to="/add-student" action>
                Add Student
            </Link>
            <Link tag='a' to="/view-student" action>
                View Student
            </Link>
            <Link tag='a' to="/add-subject" action>
                Add Subject
            </Link>
            <Link tag='a' to="/view-subject" action>
                View Subject
            </Link>
            <Link tag='a' to="/add-faculty" action>
                Add Faculty
            </Link>
            <Link tag='a' to="/view-faculty" action>
                View Faculty
            </Link>
            <Link tag='a' to="/add-exam" action>
                Add Exam
            </Link>
            <Link tag='a' to="/view-exam" action>
                View Exam
            </Link>
            <Link tag='a' to="/add-reportCard" action>
                Add Report Card
            </Link>
            <Link tag='a' to="/view-reportCard" action>
                View Report Card
            </Link>
        </ListGroup>
    );
}

export default Menu;
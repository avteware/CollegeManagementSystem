import React from "react";
import { Card, CardBody, CardTitle, CardSubtitle, CardText, CardFooter, Button, Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Table } from "reactstrap";
import Course from "./Course";


const Student = ({ student, update }) => {

    const deleteStudent = (id) => {
        axios.delete(`${base_url}/students/${id}`).then(
            (response) => {
                toast.success("Student has been deleted ");
                update(id);
            },
            (error) => {

            }
        )
    }

    return (
       <div> <Card className="text-center">
       <CardBody>
           <CardTitle>
               {student.fName}  {student.lName}

           </CardTitle>
           <CardText>
              Email : {student.email}
              

           </CardText>
           <CardText>Date of birth : {student.dob}</CardText>
           <CardText>Mobile : {student.mob}</CardText>
           <CardText>Gender : {student.gender}</CardText>
           <CardText>Father's name : {student.fatherName}</CardText>
           <CardText>Mother's name : {student.motherName}</CardText>
           <CardText>City : {student.city}</CardText>
           <CardText>State : {student.state}</CardText>
           

           <Container className="text-center">

               <Button color="danger" onClick={()=>{
                   deleteStudent(student.id);
               }}>
                   Delete
               </Button>
               <Button color="warning ">
                   Update
               </Button>
               
           </Container>
       </CardBody>
   </Card>
   <br /></div>
  

    );
}
export default Student;
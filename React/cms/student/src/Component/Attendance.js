import React from "react";
import { Card, CardBody, CardTitle, CardSubtitle, CardText, CardFooter, Button, Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Table } from "reactstrap";
import Course from "./Course";


const Attendance = ({ attendance, update }) => {

    const deleteAttendance = (rollNo) => {
        axios.delete(`${base_url}/Attendance/${rollNo}`).then(
            (response) => {
                toast.success("Attendance has been deleted ");
                update(rollNo);
            },
            (error) => {

            }
        )
    }

    return (
       <div> <Card className="text-center">
       <CardBody>
           <CardTitle>
               {attendance.date} 

           </CardTitle>
           <CardText>
              Present or Absent : {attendance.isPresent}
              

           </CardText>
          
           

           <Container className="text-center">

               {/* <Button color="danger" onClick={()=>{
                   deleteAttendance(attendance.rollNo);
               }}>
                   Delete
               </Button>
               <Button color="warning ">
                   Update
               </Button> */}
               
           </Container>
       </CardBody>
   </Card>
   <br /></div>
  

    );
}
export default Attendance;
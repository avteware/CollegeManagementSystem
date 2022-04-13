import React from "react";
import { Card,CardBody,CardTitle,CardSubtitle,CardText,CardFooter,Button,Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";



const Faculty=({faculty, update})=>{

    const deleteFaculty=(facultyId)=>{
        axios.delete(`${base_url}/faculty/${facultyId}`).then(
            (response)=>{
                toast.success("Faculty has been deleted ");
                update(facultyId);
            },
            (error)=>{

            }
        )
    }

    return(
        <Card className="text-center">
            <CardBody>
                <CardTitle>
                Faculty Name : {faculty.facultyName}
                </CardTitle>
                <CardText>
                 Email : {faculty.facultyEmail}
                </CardText>
                <CardText>
                 mob no : {faculty.facultyMob}
               </CardText>
                <CardText>
                 DOB :{faculty.facultyDob}
                </CardText>
                <CardText>
                 Gender : {faculty.facultyGender}
               </CardText>
                <CardText>
                 City : {faculty.facultyCity}
                </CardText>
                <CardText>
                   Qualification : {faculty.facultyQulification}
                </CardText>
                <CardText>
                  Experience : {faculty.facultyExp}
                </CardText>
                

                
                

                <Container className="text-center">

                    {/* <Button color="danger" onClick={()=>{
                        deleteFaculty(faculty.facultyId);
                    }}>
                        Delete
                    </Button>
                    <Button color="warning ">
                        Update
                    </Button> */}
                </Container>
            </CardBody>
        </Card>
    );
}
export default Faculty;
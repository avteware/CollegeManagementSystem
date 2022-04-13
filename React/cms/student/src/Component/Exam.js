import React from "react";
import { Card,CardBody,CardTitle,CardSubtitle,CardText,CardFooter,Button,Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";



const Exam=({exam, update})=>{

    const deleteExam=(examCode)=>{
        axios.delete(`${base_url}/Exam/${examCode}`).then(
            (response)=>{
                toast.success("Exam has been deleted ");
                update(examCode);
            },
            (error)=>{

            }
        )
    }

    return(
        <Card className="text-center">
            <CardBody>
                <CardSubtitle>
                    Exam Date : {exam.examDate}

                </CardSubtitle>
                <CardText>
                    Exam Time : {exam.examTime}
               
                </CardText>
                <Container className="text-center">

                    {/* <Button color="danger" onClick={()=>{
                        deleteExam(exam.examCode);
                    }}>
                        Delete
                    </Button>
                    <Button color="warning " style={{marginLeft: '12px'}}>
                        Update
                    </Button> */}
                </Container>
            </CardBody>
        </Card>
    );
}
export default Exam;
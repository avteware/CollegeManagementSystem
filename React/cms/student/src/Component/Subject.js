import React from "react";
import { Card, CardBody, CardTitle, CardSubtitle, CardText, CardFooter, Button, Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Table } from "reactstrap";


const Subject = ({ subject, update }) => {

    const deleteSubject = (subjectCode) => {
        axios.delete(`${base_url}/subject/${subjectCode}`).then(
            (response) => {
                toast.success("Subject has been deleted ");
                update(subjectCode);
            },
            (error) => {

            }
        )
    }

    return (
        <Card className="text-center">
            <CardBody>
                <CardTitle>
                    {subject.subjectName}

                </CardTitle>
                <CardText>
                    Subject Sem : {subject.subjectSem}

                </CardText>
                <CardText>
                    Total Theory Marks : {subject.totalTheoryMarks}

                </CardText>
                <CardText>
                Practical Theory Marks : {subject.totalPracticalMarks}

                </CardText>
                <Container className="text-center">

                    {/* <Button color="danger" onClick={() => {
                        deleteSubject(subject.subjectCode);
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
export default Subject;
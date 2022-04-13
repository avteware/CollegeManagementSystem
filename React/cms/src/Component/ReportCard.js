import React from "react";
import { Card, CardBody, CardTitle, CardSubtitle, CardText, CardFooter, Button, Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Table } from "reactstrap";


const ReportCard = ({ reportCard, update }) => {

    const deleteReportCard = (reportCardId) => {
        axios.delete(`${base_url}/ReportCard/${reportCardId}`).then(
            (response) => {
                toast.success("Report Card has been deleted ");
                update(reportCardId);
            },
            (error) => {

            }
        )
    }

    return (
        <Card className="text-center">
            <CardBody>
                <CardSubtitle>
                    Theory Marks : {reportCard.theoryMarks}

                </CardSubtitle>
                <CardText>
                    Practical Marks : {reportCard.practicalMarks}

                </CardText>
                <Container className="text-center">

                    <Button color="danger" onClick={() => {
                        deleteReportCard(reportCard.reportCardId);
                    }}>
                        Delete
                    </Button>
                    <Button color="warning ">
                        Update
                    </Button>
                </Container>
            </CardBody>
        </Card>


    );
}
export default ReportCard;
// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddReportCard = () => {

    const [reportCard, setReportCard] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(reportCard);
        postReportCardData(reportCard);
        e.preventDefault();
    }

    // creating function to post data on server
    const postReportCardData=(data)=>{
        axios.post(`${base_url}/ReportCard`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Report Card Added");
            },
            (error)=>{
                console.log(error);
            }        )
    }

    return (
        <Fragment>
            <Form onSubmit={handleForm}>
               
                <FormGroup>
                    <label>
                        Obtained theory marks
                    </label>
                    <Input type="text" placeholder="Enter Here" name="theoryMarks" id="theoryMarks"
                        onChange={(e) => {
                            setReportCard({ ...reportCard, theoryMarks: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                    Practical theory marks
                    </label>
                    <Input type="text" placeholder="Enter Here" name="practicalMarks" id="practicalMarks"
                    onChange={(e)=>{
                        setReportCard({...reportCard, practicalMarks:e.target.value});
                    }}
                    />
                </FormGroup>

                <Container>
                    <Button type="submit" color="warning ml-3">
                        Add Report Card
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
    );
};

export default AddReportCard;
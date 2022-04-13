// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddExam = () => {

    const [exam, setExam] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(exam);
        postExamData(exam);
        e.preventDefault();
    }

    // creating function to post data on server
    const postExamData=(data)=>{
        axios.post(`${base_url}/Exam`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Exam Added");
            },
            (error)=>{
                console.log(error);
            }        )
    }

    return (
        <div>
            <h1>Fill Exam Details</h1>
        <Fragment>
            <Form onSubmit={handleForm}>
                {/* <FormGroup>
                    <label>
                        Course Id
                    </label>
                    <Input type="text" placeholder="Enter Here" name="userid" id="userid"/>
                </FormGroup> */}

                <FormGroup>
                    <label>
                        Exam Date
                    </label>
                    <Input type="date" placeholder="Enter Here" name="examDate" id="examDate"
                        onChange={(e) => {
                            setExam({ ...exam, examDate: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                        Exam Time
                    </label>
                    <Input type="text" placeholder="Enter Here" name="examTime" id="examTime"
                    onChange={(e)=>{
                        setExam({...exam, examTime:e.target.value});
                    }}
                    />
                </FormGroup>

                <Container>
                    <Button type="submit" color="warning ml-3" style={{marginRight: '2px'}}>
                        Add Exam
                    </Button>

                    <Button type="reset" color="danger ml-3" style={{marginLeft: '10px'}}>
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
        </div>
    );
};

export default AddExam;
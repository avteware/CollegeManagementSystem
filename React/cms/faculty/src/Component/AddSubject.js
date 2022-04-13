// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddSubject = () => {

    const [subject, setSubject] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(subject);
        postSubjectData(subject);
        e.preventDefault();
    }

    // creating function to post data on server
    const postSubjectData=(data)=>{
        axios.post(`${base_url}/subject`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Subject Added");
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
                        Subject Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="subjectName" id="subjectName"
                        onChange={(e) => {
                            setSubject({ ...subject, subjectName: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                        Subject Sem
                    </label>
                    <Input type="text" placeholder="Enter Here" name="subjectSem" id="subjectSem"
                    onChange={(e)=>{
                        setSubject({...subject, subjectSem:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Total theory Marks
                    </label>
                    <Input type="text" placeholder="Enter Here" name="totalTheoryMarks" id="totalTheoryMarks"
                    onChange={(e)=>{
                        setSubject({...subject, totalTheoryMarks:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Total practical Marks
                    </label>
                    <Input type="text" placeholder="Enter Here" name="totalPracticalMarks" id="totalPracticalMarks"
                    onChange={(e)=>{
                        setSubject({...subject, totalPracticalMarks:e.target.value});
                    }}
                    />
                </FormGroup>

                <Container>
                    <Button type="submit" color="warning ml-3">
                        Add Subject
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
    );
};

export default AddSubject;
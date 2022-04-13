// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddCourse = () => {

    const [course, setCourses] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(course);
        postCourseData(course);
        e.preventDefault();
    }

    // creating function to post data on server
    const postCourseData=(data)=>{
        axios.post(`${base_url}/Course`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Course Added");
            },
            (error)=>{
                console.log(error);
            }        )
    }

    return (
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
                        Course Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="courseName" id="courseName"
                        onChange={(e) => {
                            setCourses({ ...course, courseName: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                        Total Sem
                    </label>
                    <Input type="text" placeholder="Enter Here" name="totalSem" id="totalSem"
                    onChange={(e)=>{
                        setCourses({...course, totalSem:e.target.value});
                    }}
                    />
                </FormGroup>

                <Container>
                    <Button type="submit" color="warning ml-3">
                        AddCourse
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
    );
};

export default AddCourse;
// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddAttendance = () => {

    const [attendance, setAttendance] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(attendance);
        postAttendanceData(attendance);
        e.preventDefault();
    }

    // creating function to post data on server
    const postAttendanceData=(data)=>{
        axios.post(`${base_url}/Attendance`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Attendance Added");
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
                        Date
                    </label>
                    <Input type="date" placeholder="YYYY-MM-DD" name="date" id="date"
                        onChange={(e) => {
                            setAttendance({ ...attendance, date: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                        Present or Absent
                    </label>
                    <Input type="text" placeholder="Enter Here" name="isPresent" id="isPresent"
                    onChange={(e)=>{
                        setAttendance({...attendance, isPresent:e.target.value});
                    }}
                    />
                </FormGroup>

                <Container>
                    <Button type="submit" color="warning ml-3">
                        Add Attendance
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
    );
};

export default AddAttendance;
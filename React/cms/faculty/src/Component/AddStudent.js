// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";


const AddStudent = () => {

    const [student, setStudent] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(student);
        postStudentData(student);
        e.preventDefault();
    }

    // creating function to post data on server
    const postStudentData=(data)=>{
        axios.post(`${base_url}/students`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Student Added");
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
                        First Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="fName" id="fName"
                        onChange={(e) => {
                            setStudent({ ...student, fName: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                        Last Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="lName" id="lName"
                    onChange={(e)=>{
                        setStudent({...student, lName:e.target.value});
                    }}
                    />
                </FormGroup>

                <FormGroup>
                    <label>
                        Email
                    </label>
                    <Input type="text" placeholder="Enter Here" name="email" id="email"
                    onChange={(e)=>{
                        setStudent({...student, email:e.target.value});
                    }}
                    />
                </FormGroup>

                <FormGroup>
                    <label>
                        Date of birth
                    </label>
                    <Input type="date" placeholder="YYYY-MM-DD" name="dob" id="dob"
                    onChange={(e)=>{
                        setStudent({...student, dob:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Mobile No.
                    </label>
                    <Input type="text" placeholder="Enter Here" name="mob" id="mob"
                    onChange={(e)=>{
                        setStudent({...student, mob:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Gender
                    </label>
                    <Input type="text" placeholder="Enter Here" name="gender" id="gender"
                    onChange={(e)=>{
                        setStudent({...student, gender:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Father's Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="fatherName" id="fatherName"
                    onChange={(e)=>{
                        setStudent({...student, fatherName:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        Mother's Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="motherName" id="motherName"
                    onChange={(e)=>{
                        setStudent({...student, motherName:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        City
                    </label>
                    <Input type="text" placeholder="Enter Here" name="city" id="city"
                    onChange={(e)=>{
                        setStudent({...student, city:e.target.value});
                    }}
                    />
                </FormGroup>
                <FormGroup>
                    <label>
                        State
                    </label>
                    <Input type="text" placeholder="Enter Here" name="state" id="state"
                    onChange={(e)=>{
                        setStudent({...student, state:e.target.value});
                    }}
                    />
                </FormGroup>
              
               


                <Container>
                    <Button type="submit" color="warning ml-3">
                        Add Student
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
    );
};

export default AddStudent;
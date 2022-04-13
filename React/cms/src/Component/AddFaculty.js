// import { Button } from "bootstrap";
import React, { Fragment,useState } from "react";
import { FormGroup, Form, Input, Container, Button } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const AddFaculty = () => {

    const [faculty, setFaculty] = useState({});

    //form handler function
    const handleForm = (e) => {
        console.log(faculty);
        postFacultyData(faculty);
        e.preventDefault();
    }

    // creating function to post data on server
    const postFacultyData=(data)=>{
        axios.post(`${base_url}/faculty`,data).then(
            (response)=>{
                console.log(response);
                console.log("success");
                toast.success("Faculty Added");
            },
            (error)=>{
                console.log(error);
            }        )
    }

    return (
        <div>
            <h1>Fill Faculty Details</h1>
        <Fragment>
            <Form onSubmit={handleForm}>
                

                <FormGroup>
                    <label>
                    Faculty Name
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyName" id="facultyName"
                        onChange={(e) => {
                            setFaculty({ ...faculty, facultyName: e.target.value });
                        }} />
                </FormGroup>

                <FormGroup>
                    <label>
                    Faculty Email
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyEmail" id="facultyEmail"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyEmail:e.target.value});
                    }}
                    />
                </FormGroup>

                <FormGroup>
                    <label>
                    Faculty Mob
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyMob" id="facultyMob"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyMob:e.target.value});
                    }}
                    />
                </FormGroup>

                
                <FormGroup>
                    <label>
                    Faculty Dob
                    </label>
                    <Input type="date" placeholder="YYYY-MM-DD" name="facultyDob" id="facultyDob"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyDob:e.target.value});
                    }}
                    />
                </FormGroup>
                

                <FormGroup>
                    <label>
                    Faculty Gender
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyGender" id="facultyGender"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyGender:e.target.value});
                    }}
                    />
                </FormGroup>
                



                <FormGroup>
                    <label>
                    Faculty City
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyCity" id="facultyCity"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyCity:e.target.value});
                    }}
                    />
                </FormGroup>
                



                <FormGroup>
                    <label>
                    Faculty Qulification
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyQulification" id="facultyQulification"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyQulification:e.target.value});
                    }}
                    />
                </FormGroup>
                



                <FormGroup>
                    <label>
                    Faculty Experience
                    </label>
                    <Input type="text" placeholder="Enter Here" name="facultyExp" id="facultyExp"
                    onChange={(e)=>{
                        setFaculty({...faculty, facultyExp:e.target.value});
                    }}
                    />
                </FormGroup>
                


                <Container>
                    <Button type="submit" color="warning ml-3">
                        Add Faculty
                    </Button>

                    <Button type="reset" color="danger ml-3">
                        Clear
                    </Button>
                </Container>
            </Form>
        </Fragment>
        </div>
    );
};

export default AddFaculty;
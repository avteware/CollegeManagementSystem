import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";

import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Student from "./Student";


const AllStudent = () => {

    const getAllStudent = () => {
        axios.get(`${base_url}/students`).then(
            (response) => {
                console.log(response.data);
                toast.success("All Students loaded")
                setStudent(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllStudent();
    }, []);

    const [student, setStudent] = useState([]);

    // to refreah after delete course
    const removeStudentByCode=(id)=>{
        setStudent(student.filter((c)=>c.id!=id));
    }

    return (
        <div>
            <h1>
                All Students
            </h1>

            {student.length > 0 ? student.map((item) => (
                <Student key={item.id} student={item} update={removeStudentByCode} />


            )) : "No Students!"}

        </div>
    );
};

export default AllStudent;
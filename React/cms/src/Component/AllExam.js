import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";

import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Exam from "./Exam";

const AllExam = () => {

    const getAllExam = () => {
        axios.get(`${base_url}/Exam`).then(
            (response) => {
                console.log(response.data);
                toast.success("Exam has been loaded")
                setExam(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllExam();
    }, []);

    const [exam, setExam] = useState([]);

    // to refreah after delete course
    const removeExamByCode=(examCode)=>{
        setExam(exam.filter((g)=>g.examCode!=examCode));
    }

    return (
        <div>
            <h1>
                All Exams
            </h1>

            {exam.length > 0 ? exam.map((item) => (
                < Exam key={item.examCode} exam={item} update={removeExamByCode} />


            )) : "No Exam!"}

        </div>
    );
};

export default AllExam;
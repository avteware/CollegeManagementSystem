import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";
import Course from "./Course";
import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";


const AllCourses = () => {

    const getAllCourse = () => {
        axios.get(`${base_url}/Course`).then(
            (response) => {
                console.log(response.data);
                toast.success("courses has been loaded")
                setCourses(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllCourse();
    }, []);

    const [courses, setCourses] = useState([]);

    // to refreah after delete course
    const removeCourseByCode=(courseCode)=>{
        setCourses(courses.filter((c)=>c.courseCode!=courseCode));
    }

    return (
        <div>
            <h1>
                All Courses
            </h1>

            {courses.length > 0 ? courses.map((item) => (
                <Course key={item.courseCode} course={item} update={removeCourseByCode} />


            )) : "No Course!"}

        </div>
    );
};

export default AllCourses;
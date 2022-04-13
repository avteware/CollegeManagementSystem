import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";

import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Faculty from "./Faculty";

const AllFaculty = () => {

    const getAllFaculty = () => {
        axios.get(`${base_url}/faculty`).then(
            (response) => {
                console.log(response.data);
                toast.success("faculty has been loaded")
                setFaculty(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllFaculty();
    }, []);

    const [faculty, setFaculty] = useState([]);

    // to refreah after delete course
    const removeFacultyByCode=(facultyId)=>{
        setFaculty(faculty.filter((f)=>f.facultyId!=facultyId));
    }

    return (
        <div>
            <h1>
                All Faculty
            </h1>

            {faculty.length > 0 ? faculty.map((item) => (
                <Faculty key={item.facultyId} faculty={item} update={removeFacultyByCode} />


            )) : "No Faculty!"}

        </div>
    );
};

export default AllFaculty;
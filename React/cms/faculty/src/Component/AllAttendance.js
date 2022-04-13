import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";

import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Attendance from "./Attendance";


const AllAttendance = () => {

    const getAllAttendance = () => {
        axios.get(`${base_url}/Attendance`).then(
            (response) => {
                console.log(response.data);
                toast.success("All Attendance loaded")
                setAttendance(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllAttendance();
    }, []);

    const [attendance, setAttendance] = useState([]);

    // to refreah after delete course
    const removeAttendanceByCode=(rollNo)=>{
        setAttendance(attendance.filter((c)=>c.rollNo!=rollNo));
    }

    return (
        <div>
            <h1>
                All Attendance
            </h1>

            {attendance.length > 0 ? attendance.map((item) => (
                <Attendance key={item.rollNo} attendance={item} update={removeAttendanceByCode} />


            )) : "No Attendance!"}

        </div>
    );
};

export default AllAttendance;
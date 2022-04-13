import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";

import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Student from "./Student";
import ReportCard from "./ReportCard";


const AllReportCard = () => {

    const getAllReportcard = () => {
        axios.get(`${base_url}/ReportCard`).then(
            (response) => {
                console.log(response.data);
                toast.success("All Report Card loaded")
                setReportCard(response.data);
            },
            (error) => {
                console.log(error);
            }
        );
    };

    useEffect(() => {
        getAllReportcard();
    }, []);

    const [reportCard, setReportCard] = useState([]);

    // to refreah after delete course
    const removeReportCardByCode=(reportCardId)=>{
        setReportCard(reportCard.filter((c)=>c.reportCardId!=reportCardId));
    }

    return (
        <div>
            <h1>
                All Report Card
            </h1>

            {reportCard.length > 0 ? reportCard.map((item) => (
                <ReportCard key={item.reportCardId} reportCard={item} update={removeReportCardByCode} />


            )) : "No Report Cards!"}

        </div>
    );
};

export default AllReportCard;
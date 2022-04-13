import React, { useState, useEffect } from "react";
import { NavItem } from "reactstrap";
import Course from "./Course";
import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import Subject from "./Subject";

const AllSubject = () => {
  const getAllSubject = () => {
    axios.get(`${base_url}/subject`).then(
      (response) => {
        console.log(response.data);
        toast.success("Subject has been loaded");
        setSubject(response.data);
      },
      (error) => {
        console.log(error);
      }
    );
  };

  useEffect(() => {
    getAllSubject();
  }, []);

  const [subject, setSubject] = useState([]);

  // to refreah after delete course
  const removeSubjectByCode = (subjectCode) => {
    setSubject(subject.filter((c) => c.subjectCode != subjectCode));
  };

  return (
    <div>
     <h1>All Subjects</h1>

      {subject.length > 0
        ? subject.map((item) => (
            <Subject
              key={item.subjectCode}
              subject={item}
              update={removeSubjectByCode}
            />
          ))
        : "No Subjects!"}
    </div>
  );
};

export default AllSubject;

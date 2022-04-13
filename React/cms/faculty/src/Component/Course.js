import React from "react";
import { Card, CardBody, CardTitle, CardSubtitle, CardText, CardFooter, Button, Container } from "reactstrap";
import axios from "axios";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
import { Table } from "reactstrap";


const Course = ({ course, update }) => {

    const deleteCourse = (courseCode) => {
        axios.delete(`${base_url}/Course/${courseCode}`).then(
            (response) => {
                toast.success("Course has been deleted ");
                update(courseCode);
            },
            (error) => {

            }
        )
    }

    return (
        <Card className="text-center">
            <CardBody>
                <CardSubtitle>
                    Course Name : {course.courseName}

                </CardSubtitle>
                <CardText>
                    Total Sem : {course.totalSem}

                </CardText>
                <Container className="text-center">

                    <Button color="danger" onClick={() => {
                        deleteCourse(course.courseCode);
                    }}>
                        Delete
                    </Button>
                    <Button color="warning ">
                        Update
                    </Button>
                </Container>
            </CardBody>
        </Card>

        // <div>
        //     <Table>
        //         <thead>
        //             <tr>

        //                 <th>
        //                     Course Name
        //                 </th>
        //                 <th>
        //                     Total Number of sem
        //                 </th>

        //             </tr>
        //         </thead>
        //         <tbody>
        //            <tr>  <td>
        //                     {course.courseName}
        //                 </td>
        //                 <td>
        //                     {course.totalSem}
        //                 </td></tr>





        //         </tbody>
        //     </Table>
        // </div>


    );
}
export default Course;
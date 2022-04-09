package week_04;

import java.util.Scanner;

public class HttpStatusCode {
    public static void main(String[] args) {

        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();
        String str="";
        switch (status){
            case 200: str="OK";break;
            case 201: str="Created";break;
            case 202: str="Accepted";break;
            case 301 : str="Moved Permanently"; break;
            case 303 : str="See Other"; break;
            case 304 : str="Not Modified"; break;
            case 307 : str="Temporary Redirect"; break;
            case 400 : str="Bad Request"; break;
            case 401 : str="Unauthorized"; break;
            case 403 : str="Forbidden"; break;
            case 404 : str="Not Found"; break;
            case 410 : str="Gone"; break;
            case 500 : str="Internal Server Error"; break;
            case 503 : str="Service Unavailable"; break;
            default: str="Invalid status code";
        }
        System.out.println(str);






    }
}

/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
Given an int variable status write a switch statement to display the status code message. If an invalid status code is entered display Invalid status code!

Example:

Display message: "Enter status code:"
​
input: 200
​
Display message: "OK"
 */

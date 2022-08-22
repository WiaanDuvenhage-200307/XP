
<br />

![GitHub repo size](https://img.shields.io/github/repo-size/WiaanDuvenhage-200307/XP?color=red)
![GitHub watchers](https://img.shields.io/github/watchers/WiaanDuvenhage-200307/XP?color=red)
![GitHub language count](https://img.shields.io/github/languages/count/WiaanDuvenhage-200307/XP?color=red)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/WiaanDuvenhage-200307/XP?color=red)

<h5 align="center" style="padding:0;margin:0;">Wiaan Duvenhage</h5>
<h5 align="center" style="padding:0;margin:0;">200307</h5>
<h6 align="center">DV203 | Android Introduction</h6>
</br>
<p align="center">

  <a href="https://github.com/WiaanDuvenhage-200307/XP">
    <img src="Images/xplogo.png" width="100px">
  </a>

<h3 align="center">XP</h3>

  <p align="center">
    An Android Application built with Kotlin, that quizzes users on their esports knowledge.<br>

   <br />
   <br />
   <a href="URL">View Demo</a>
    ·
    <a href="https://github.com/WiaanDuvenhage-200307/XP/issues">Report Bug</a>
    ·
    <a href="https://github.com/WiaanDuvenhage-200307/XP/issues">Request Feature</a>
</p>
<!-- TABLE OF CONTENTS -->

## Table of Contents

- [About the Project](#about-the-project)
    - [Project Description](#project-description)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [How to install](#how-to-install)
- [Features and Functionality](#features-and-functionality)
- [Concept Process](#concept-process)
    - [Ideation](#ideation)
    - [Wireframes](#wireframes)
- [Development Process](#development-process)
    - [Implementation Process](#implementation-process)
        - [Highlights](#highlights)
        - [Challenges](#challenges)
    - [Future Implementation](#peer-reviews)
- [Final Outcome](#final-outcome)
    - [Mockups](#mockups)
    - [Video Demonstration](#video-demonstration)
- [Conclusion](#conclusion)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)

<!--PROJECT DESCRIPTION-->

## About the Project

<!-- header image of project -->

![image1][image1]

### Project Description

This is XP! A simple quiz app that quizzes users on their knowledge on all types of esports around the world from veteran esports like Counter Strike all the way to new games entering the esports scene like Valorant. This is a fun app that friends can download to see who can get the highest score and ultimately gain XP (experience). People of all ages can play this game, it just has one requirement, be on top of your esports game.

### Built With

- [Kotlin](https://kotlinlang.org/)
- [Android Studio](https://developer.android.com/studio?gclid=CjwKCAjwuYWSBhByEiwAKd_n_q4WXi5vcCji08peoWOEsv-KHFT7QWNZNmozB_CIiiSNl_HOUL-1JBoCGx8QAvD_BwE&gclsrc=aw.ds)

<img src="https://4.bp.blogspot.com/-cE71mKJc94w/VrT2tLTxXTI/AAAAAAAACjU/KdygZ1AN0Nc/s1600/image04.png" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Kotlin_Icon.svg/512px-Kotlin_Icon.svg.png?20171012085709" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<!-- GETTING STARTED -->
<!-- Make sure to add appropriate information about what prerequesite technologies the user would need and also the steps to install your project on their own mashines -->

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

For development, the latest version of Android Studio is required. The latest version can be downloaded from [Android Studio](https://developer.android.com/studio?gclid=CjwKCAjwuYWSBhByEiwAKd_n_q4WXi5vcCji08peoWOEsv-KHFT7QWNZNmozB_CIiiSNl_HOUL-1JBoCGx8QAvD_BwE&gclsrc=aw.ds)

### Installation

1. Clone the repo
```sh
git clone https://github.com/Pieter-stack/Kidcelence.git
```
2. Open the project

Use `File` : `Open` in Android Studio.

<!-- FEATURES AND FUNCTIONALITY-->
<!-- You can add the links to all of your imagery at the bottom of the file as references -->

## Features and Functionality

<!-- note how you can use your gitHub link. Just make a path to your assets folder -->

### Adding an Appointment

![image5](PATH)
The receptionist can add an appointment by assigning a patient to a doctor. They can add the name, date and time and it will display on the page when the page auto-refreshes.

### Scroll Through Calendar

![image6](PATH)
The receptionist can scroll through the calendar to see which date falls on which day, the receptionist can go forward or backward in time using the arrows underneath the month's name.

### Add Doctor/Patient

![image7](PATH)
The receptionist can add a new doctor or patient's information into the modal and it will push to the database and display on the page after it refreshes.

### Only Head Receptionist can add
![image8](PATH)
![image10](PATH)
The head receptionist is the only one authorized to add, delete or update appointments, patients & doctors

<!-- CONCEPT PROCESS -->
<!-- Briefly explain your concept ideation process -->
<!-- here you will add things like wireframing, data structure planning, anything that shows your process. You need to include images-->

## Concept Process

It was very evident that blue is something that is very evident when designing dashboards or management portals for medical firms. So it is the route that I decided to go with Salubrious, I tried keeping it clean with different hue's of blue and some accents of a lime green.

### Wireframes

![image7][image7]
![image11](PATH)
![image12](PATH)

## Development Process

The `Development Process` is the technical implementations and functionality done in the frontend and backend of the application.

### Implementation Process

- I used `npx create-react app` to create this React project. I implemented component-based development instead of classes. By doing this, I will be able to easily inject and eject components and sub-components into my project, making it refactorable and reusable instead of writing up classes I have to do everytime making it tedious and redundant

- I implemented the `date-fns` dependency to manipulate and display the time & date the I wanted to and to create my calendar

- I incorporated `tailwindcss` to create and style my calendar component the way I wanted it to look

- `axios` was implemented so that I can make HTTP requests to the database server so that I can retrieve and push data to it

- I used `PHPMyAdmin` to alter data on the database and used PHP to talk to the backend MySQL database



#### Highlights

<!-- stipulated the highlight you experienced with the project -->

- A highlight of this project was defintely interacting with the database and manipulating data on the database and seeing it being displaye on the application.

#### Challenges

<!-- stipulated the challenges you faced with the project and why you think you faced it or how you think you'll solve it (if not solved) -->

- I struggled to get all my updates and deletes to be implemented.
- I struggled to get all my profile pictures to be updated and rendered on the DOM from the Database.
- debugging the CORS error's for sending data to the Database, especially my Register page's CORS error
- I struggled a lot with debugging the PHP error's
- Front-end was also a bit tricky because I kept following the trend of putting everything in blocks

#### Above And Beyond

<!-- TODO Change this! -->

The aspects I learned outside of this class, is that I implemented tailwindcss to create my calendar, I also incorporated the Date-fns dependency to render my calendar dates.

### Future Implementation

<!-- TODO Change this! -->

<!-- stipulate functionality and improvements that can be implemented in the future. -->

- I want to complete all my update and delete's of the patients and doctor's
- I want to fix my styling for my application
- I want to display the appointments by week
- I want to complete the profile pictures to be rendered and updated

<!-- MOCKUPS -->

## Final Outcome

### Mockups

<!-- TODO Change this -->

![image2](PATH)
![image3](PATH)
![image4](PATH)
![image5](PATH)
<br>


<!-- VIDEO DEMONSTRATION -->

### Video Demonstration

<!-- TODO Change this -->

To see a run through of the application, click below:

[View Demonstration](URL)

See the [open issues](https://github.com/WiaanDuvenhage-200307/XP/issues) for a list of proposed features (and known issues).

<!-- AUTHORS -->

## Authors

- **Wiaan Duvenhage** - [Github](https://github.com/WiaanDuvenhage-200307)

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE` for more information.\

<!-- LICENSE -->

## Contact

- **Wiaan Duvenhage** - [wiaanduvenhage.dev@gmail.com](mailto:wiaanduvenhage.dev@gmail.com) - [@wiaan.dev](https://www.instagram.com/wiaan.dev/)
- **Project Link** - https://github.com/WiaanDuvenhage-200307/XP

<!-- ACKNOWLEDGEMENTS -->

## Acknowledgements

<!-- all resources that you used and Acknowledgements here -->
<!-- TODO Change this -->

- [Stack Overflow](https://stackoverflow.com/)
- [Cooolors](https://coolors.co/)
- [Figma](https://www.figma.com/)
- [My Pinterest Board](https://za.pinterest.com/doubleudeedesigns/budget-app/)
- [(w3schools) SQL SELECT Statement](https://www.w3schools.com/sql/sql_select.asp)

[image1]: Images/aboutproject.jpg
[image2]: Images/Image2.png
[image3]: Images/Image3.png
[image4]: Images/Image4.png
[image5]: Images/Image5.png
[image6]: Images/Image6.png
[image7]: Images/wireframes.png
[image8]: Images/Image8.png
[image9]: Images/Image9.png
[image10]: Images/Image10.png
[image11]: Images/Mockup6.png

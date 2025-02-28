<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![project_license][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
<h3 align="center">FizzBuzz</h3>

  <p align="center">
    A basic Spring Boot application that prints Fizz and or Buzz
    <br />
    <a href="https://github.com/mmmiller3rd/FizzBuzz"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/mmmiller3rd/FizzBuzz">View Demo</a>
    &middot;
    <a href="https://github.com/mmmiller3rd/FizzBuzz/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    &middot;
    <a href="https://github.com/mmmiller3rd/FizzBuzz/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This project is my solution to the common FizzBuzz coding challenge. Here's the challenge:
- Write a short program that prints each number from 1 to n on a new line.
- For each multiple of 3, print "Fizz" instead of the number.
- For each multiple of 5, print "Buzz" instead of the number.
- For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* [![Spring][Spring]][Spring-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow the steps below.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* install Java 17
  ```sh
  visit https://www.oracle.com/java/technologies/downloads/
  install Java 17 for your machine
  ```
* Verify that you have at least JDK 8 set in you environment variables

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/mmmiller3rd/FizzBuzz.git
   ```
2. Install Java dependencies
   ```sh
   ./gradlew clean build
   ```
3. Change git remote url to avoid accidental pushes to base project
   ```sh
   git remote set-url origin mmmiller3rd/FizzBuzz
   git remote -v # confirm the changes
   ```

### Running

1. Execute
    ```sh
   ./gradlew bootRun
   ```

2. Make request
    ```sh
   "n" is not required in the request. The default value if none is provided is 100.
   curl --location 'localhost:8080/runFizzBuzz'
   curl --location 'localhost:8080/runFizzBuzz?n=<SomeNumber>'
    ```
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Top contributors:

<a href="https://github.com/mmmiller3rd/FizzBuzz/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=mmmiller3rd/FizzBuzz" alt="contrib.rocks image" />
</a>



<!-- CONTACT -->
## Contact

Melvin Miller - mmmiller3rd@gmail.com

Project Link: [https://github.com/mmmiller3rd/FizzBuzz](https://github.com/mmmiller3rd/FizzBuzz)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [Best-README-Template](https://github.com/othneildrew/Best-README-Template/blob/main/BLANK_README.md#readme-top)
* []()
* []()

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/mmmiller3rd/FizzBuzz.svg?style=for-the-badge
[contributors-url]: https://github.com/mmmiller3rd/FizzBuzz/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/mmmiller3rd/FizzBuzz.svg?style=for-the-badge
[forks-url]: https://github.com/mmmiller3rd/FizzBuzz/network/members
[stars-shield]: https://img.shields.io/github/stars/mmmiller3rd/FizzBuzz.svg?style=for-the-badge
[stars-url]: https://github.com/mmmiller3rd/FizzBuzz/stargazers
[issues-shield]: https://img.shields.io/github/issues/mmmiller3rd/FizzBuzz.svg?style=for-the-badge
[issues-url]: https://github.com/mmmiller3rd/FizzBuzz/issues
[license-shield]: https://img.shields.io/github/license/mmmiller3rd/FizzBuzz.svg?style=for-the-badge
[license-url]: https://github.com/mmmiller3rd/FizzBuzz/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/melvin-miller-0a823799
[Spring]: https://img.shields.io/badge/Spring-6db33f?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://start.spring.io/
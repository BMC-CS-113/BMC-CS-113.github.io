---
title: Computer Science I - CS113 - Bryn Mawr College
layout: default
img: <!-- turk-engraving-detail -->
img_link: <!-- http://en.wikipedia.org/wiki/The_Turk -->
caption: <!--An engraving of the Mechanical Turk, the 18th century chess-playing automaton -->
active_tab: main_page 
---


This is an introduction to the discipline of computer science, suitable for those students with a mature quantitative ability. This fast-paced course covers the basics of computer programming, with an emphasis on program design, problem decomposition, and object-oriented programming in Java. Graduates of this course will be able to write small computer programs independently; examples include data processing for a data-based science course, small games, or estimating likelihood of probabilistic events, etc.. No computer programming experience is necessary or expected. Students are required to register for a weekly lab.

<!-- Display an alert about upcoming homework assignments -->
{% capture now %}{{'now' | date: '%s'}}{% endcapture %}
{% for page in site.pages %}
{% if page.release_date and page.due_date %}
{% capture release_date %}{{page.release_date | date: '%s'}}{% endcapture %}
{% capture due_date %}{{page.due_date | date: '%s'}}{% endcapture %}
{% if release_date < now and due_date >= now %}
<div class="alert alert-info">
<a href="{{site.url}}{{site.baseurl}}{{page.url}}">{{ page.title }}</a> has been released.  
{% if page.deliverables %}
The assignment has multiple deliverables.
{% for deliverable in page.deliverables %}
The {{deliverable.description}} is due before {{ deliverable.due_date | date: "%I:%M%p" }} on {{ deliverable.due_date | date: "%A, %B %-d, %Y" }}.  
{% endfor %}
{% else %}
It is due before {{ page.due_date | date: "%I:%M%p" }} on {{ page.due_date | date: "%A, %B %-d, %Y" }}.
{% endif %}
</div>
{% endif %}
{% endif %}
{% endfor %}
<!-- End alert for upcoming homework assignments -->


<!--
<div class="alert alert-info" markdown="1">
Check out the [excellent final projects](http://crowdsourcing-class.org/final-projects-2016.html) from last year's class.
</div>
-->


Course number
: CMSC B113 - students from all majors are welcome!

Instructor
: [Adam Poliak](https://wwww.azpoliak.github.io)

Teaching Assistants
: [Course Staff](staff.html) 

Discussion Forum
: [Piazza](https://piazza.com/brynmawr/fall2024/cs113)

Code Samples From Lecture 
: [Github](https://github.com/BMC-CS-113/class-examples-f24)

Time and place
: Fall 2024
: TTH 1:10-2:30pm, Location: Park 300
: Lab TH: 2:40-4:00pm, Location: Park 231

Prerequisites
: None - no prior programming background is required

Course Readings
: Each lecture has an accompanying chapter/section of the <a href="{{ site.url }}/{{ site.baseurl }}/textbook/cs113Textbook.pdf">textbook</a>
: Some lectures will have accompanying optional reading related to the lecture's topic

Grading
* Homeworks: 30%
* Labs: 5%
* Midterms: 27%
* Final: 33% 
* Participation: 5%


Late day policy
: As a general rule, no late homework will be accepted.
<br>
See the <a href="{{ site.url }}{{ site.baseurl }}/policies.html">Policies</a> for more details.

<!--#### Acknowledgments-->

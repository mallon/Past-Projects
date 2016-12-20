CMS-CL: A DSL to simplify websites configuration - (April 2014)
---------------------------------------------------------------

Most company websites are implemented on top of a Content Management System (CMS).
Even though CMSs are simpler to use than pure static HTML sites, their configuration
still require technical knowledge (database configuration, installation of plug-ins,...)
that no all end-users have.
  
In this sense, we propose a Domain Specific Language (DSL) that enables to non-expert
users to easily indicate their configuration preferences (in terms of functionalities,
appearance, default content, ...). As notation for our DSL we adopt the mind-mapping 
syntax which is easy to learn and familiar for many users. Our approach has been 
implemented for WordPress, and an experimentation has been carried out with end-users
to measure its usefulness.

*********************************************

Objective :
-----------

- Website configuration simplification for end-users
The following schema describe the client-server platform :
![Alt text](/Paper/resources/png/final_ClientServer_numbered.png "Client-server communication")

Tools and languages used :
--------------------------

- XText
- WordPress
- FreePlane
- Java
- ATL
- MoDisco
- XML editor
... And others from the Eclipse Modeling Framework (E.M.F.)

Adress : matthieu.allon@gmail.com


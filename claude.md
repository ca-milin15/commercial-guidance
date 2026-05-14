--General indications
After executed each task, must be update the JIRA task to "IN REVIEW" and leave a spanish summary comment in that JIRA ticket
--
Back-end technical design
--
- use spring boot greather than 3.x and java 17
- use mix between hexagonal: naming the three layers: infrastructure, domain and application
- within instructure layer you put class related to technology classes, e.g: Controller, ControllerAdvice,interfaces and impl relates to DB
- within application layer you put impl classes related functionalities, e.g: cretae an impl and its interface to read, cretae, update and delete. Each functionality you must use DDD use cases
- within domain layer you put impl classes related classes that map DB entities.
- you must use SOLID principles
- you must apply pattern design on the bussines logic wheter is necessary


--
Front-end technical design:
- Use scaffolding, one folder by view

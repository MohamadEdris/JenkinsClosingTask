# JenkinsClosingTask
Ynet Breaking News.

# About
Java Application Managed by Maven that “Breaking News” from YNet new service by taking Ynet xml(http://www.ynet.co.il/Integration/StoryRss2.xml), and build a new Java Aplication Managed by Maven that Presents the Breaking News XML in an HTML Table Format.

# Run Locally

#### Clone the project
```bash
git clone https://github.com/MohamadEdris/JenkinsClosingTask.git
```
#### Go to the project directory
```bash
cd JenkinsClosingTask 
```
#### Build the project
```bash
mvn package  
```
#### Start the server
```bash
java -jar ./target/JenkinsClosingTask-0.0.1-SNAPSHOT.jar
```  
##### access : http://localhost:8082/

![ynet news](https://user-images.githubusercontent.com/73100170/177007660-7ad728cc-a156-4a22-962c-cd41a40cc047.PNG)

### Jenkins pipeline Job

![closing-task](https://user-images.githubusercontent.com/73100170/177007688-caabdbdd-ae29-4414-ad42-b1c0352332cf.PNG)

##### After the build finish Jenkins send Slack notification (Build Success/Failed)

![slak](https://user-images.githubusercontent.com/73100170/177007722-13d9e454-050f-4b6a-a581-bb93b784e504.PNG)

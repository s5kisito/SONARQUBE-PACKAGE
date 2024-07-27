############################################################################################
bastion_public_ip = "44.193.203.248"
vpc_id = "vpc-07f7dd613d635a432"

SONARQUBE 

I. What is Sonarqube?:
---------------------

Sonarqube is a self-managed, automatic code review tool focused on 
Promoting [Clean Code Practices].
Sonarqube integrates seamlessly into existing development workflows, including 
Continuous Integration (CI) pipelines in DevOps environments, to provide Continuous Code
Inspection and ensure high-quality standards across projects.

The product analyses 30+ different programming languages and integrates into your
Continuous Integration (CI) pipeline of DevOps platforms to ensure that your code meets 
high-quality standards.



II. What is Clean Code?
----------------------- 

Clean Code is code that is easy to Read, Maintain, Understand and Change through structure and 
consistency yet remains robust and secure to withstand performance demands. 
It lets you get the most value out of your software.

III. Clean Code Principles and Best Practices.

When developers write code (which is like the blueprint for software), they need to do it in a 
way that makes it strong, safe from bugs, easy to understand, and resistant to cyber threats.
To achieve this, they follow best Coding Practices. These are like rules or guidelines that 
help them write better code. When code is written well, it makes it easier for developers to 
Work Together, Fix Problems, and add new features without causing more issues.

[A. Consistent Code.
The code is written in a uniform and conventional way. All the code looks similar and follows 
a regular pattern, even with multiple contributors at different times. Consistent code is 
formatted, conventional, and identifiable. For example, when code is formatted well, it is 
systematic and regular, which reduces differences between authors’ coding styles and makes 
code much easier to review by peers on pull requests.

Formatted: The code presentation is well-organized, systematic, and regular. 
Conventional: The code performs tasks with expected instructions. 
Identifiable: The names follow a regular structure based on language conventions without 
arbitrary differences. 

B. Intentional Code.
The code is clear, precise, and purposeful. Intentional code reads like it is written with 
attention and care to convey its purpose. Every instruction makes sense, is adequately formed,
and simply communicates its behavior. Intentional code is clear, logical, complete, 
and efficient. For example, clear code is self-explanatory and transparently communicates its
functionality, making it easier to understand the program and reducing the likelihood of 
bugs being introduced.

Clear: The code is self-explanatory, transparently communicating its functionality.
Logical: The code has well-formed and sound instructions that work together.
Complete: The code constructs are comprehensive and used adequately and thoroughly.

C. Adaptable Code.
The code is structured to evolve easily and with confidence. It makes extending or repurposing
its parts easy and promotes localized changes without undesirable side effects. Adaptable code
is focused, distinct, modular, and tested. For example, when code is modular it is organized 
and distributed to emphasize the separation between its parts, making it easier to manage and 
clearly define the relationships within.

Focused: The code has a single, narrow, and specific scope.
Distinct: The code procedures and data are unique and distinctive, without undue duplication.
Modular: The code has been organized and distributed to emphasize the separation between its 
parts.
Tested: The code has automated quality tests that provide confidence in the functionality

D. The Code Takes Into Account its Ethical Obligations on data and the potential impact of 
societal norms. Responsible code is lawful, trustworthy, and respectful. For Example, 
when we classify code as lawful, we refer to it as code that respects licensing and copyright 
regulation, enabling a creator to license their own code and respecting others licensing rights. 
equally as important, code should be trustworthy and should not contain secrets.

Lawful: The code respects licensing and copyright regulation.
Trustworthy: The code abstains from revealing or hard-coding private information.
Respectful: The code refrains from using discriminatory and offensive language]


IV. What is Clean As You Code?
------------------------------

Sonar Clean as You Code approach eliminates many of the pitfalls that arise from reviewing 
code at a late stage in the development process. The Clean as You Code approach uses your 
quality gate to alert/inform you when there’s something to fix or review in your new code 
(code that has been added or changed), allowing you to maintain high standards and focus on 
code quality.

Clean as You Code sets a clear expectation that allows developers to take full ownership of 
their code and make sure their deliveries meet high-quality standards.
With Clean as You Code, you are not responsible for anyone else code. You own the quality and 
security of the new code you are working on today. If you add new issues, 
SonarQube automatically assigns them to you so you can maintain the quality of your code.

V. What is Quality Gate.
------------------------

Your quality gate acts as a Checkpoint to determine if your project is ready for release, 
focusing on new code metrics ensures that new features are delivered cleanly, and as long as 
your quality gate remains green, your releases will improve continuously.
By setting and enforcing high standards for new code, you can maintain consistent quality 
without worrying about cleaning up old code, and if a project does not meet these standards, 
consistently passing the quality gate provides a reliable measure of code quality, indicating 
it will not pass the quality gate, indicating it is not ready for release.
consistently passing the quality gate provides a reliable measure of code quality, indicating 
that developers can uphold high standards across all new code.

We recommend configuring all your quality gates to make them Clean as You Code ready. 
You can do this by configuring your quality gate conditions for new code. 
This helps you ensure that you are not introducing issues in your code.


| Concept              | Definition                                                                                                                                                             |
|----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Clean Code           | Code whose attributes make your software reliable, secure, 
                         and maintainable.         
                                                                                                        |
| Bug                  | An issue that represents something wrong in the code. 
                        Needs to be fixed as soon as possible to prevent potential future 
                        problems.     
                                                       |
| Code Smell           | A maintainability-related issue in the code. Leaving it unresolved 
                        can lead to difficulties for developers and may introduce additional 
                        errors.            
                                 |
| Cost                 | See Remediation cost. 
                                                                                                                                                |
| Debt                 | See Technical debt.   
                                                                                                                                                |
| Issue                | When code does not comply with a rule, an issue is logged. 
                        Represents areas that need attention or improvement.   
                                                                           |
| Measure              |The value of a metric for a given file or project at a given time. 
                        Examples include lines of code, code complexity, etc.  
                                                                   |
| Metric               | A type of measurement that can have varying values over time. 
                         Examples include code duplication, code coverage, etc. 
                                                                          |
| New Code Definition | A change set or period where new problems might arise. Monitored 
                        closely to ensure code quality.     
                                                                                          |
| Quality Profile      | A set of rules defining coding standards to be followed. 
                        Each snapshot is based on a single quality profile.  
                                                                              |
| Rule                 | A coding standard or practice that should be followed. 
                        Non-compliance can lead to issues and hotspots. Used to measure code 
                        quality.                                    |

| Remediation Cost     | The estimated time required to fix vulnerability and reliability 
                        issues.                   
                                                                                                     |
| Snapshot             | A set of measures and issues on a project at a given time. 
                        Generated for each analysis.   
                                                                                                     |
| Security Hotspot     | Security-sensitive pieces of code requiring manual review. 
                        Indicates potential vulnerabilities that need to be addressed. 
                                                                    |
| Technical Debt       | The estimated time required to fix all maintainability issues and 
                        code smells. Indicates areas where code quality can be improved. 
                                                           |
| Vulnerability        | A security-related issue representing a potential backdoor for 
                        attackers. Requires attention to mitigate potential risks.                                             |


VI. Rules in SonarQube .
-----------------------

SonarQube executes rules on source code to generate issues. There Are 4 Types Of Rules:

.Code Smell (maintainability domain)
.Bug (reliability domain)
.Vulnerability (security domain).
.Security hotspot (security domain)

- For Code Smells and Bugs, Zero false positives are expected. 
At least this is the target so that developers do not have to wonder if a fix is required.

- For vulnerabilities, the goal is to have more than 80% of issues be true positives.

-Security hotspot rules draw attention to code that is security-sensitive. 
It is expected that more than 80% of the issues will be quickly resolved as "reviewed" 
after being reviewed by a developer.


VII. Installation and Implementation.
-------------------------------------

1.First Option: Zip File Download.

a. Download SonarQube Community Edition zip file. https://www.sonarqube.org/downloads/
[Make sure JAVA 17 ( brew install --cask temurin[17 or +] & source it) & 
HOMEBREW are installed]for mac users.
b. Open terminal and cd where the zip file was Downloaded.
c. Unzip sonarqube-<version>.zip [zip file]
d. Move SonarQube (Optional): mv sonarqube-<version> /usr/local/sonarqube (or leave as it is)

e. Configure SonarQube:
-Navigate to the conf directory inside the SonarQube installation directory.
-Edit the sonar.properties file to configure SonarQube settings as needed. 
-Pay attention to the database configuration, server port, etc.

f. Start SonarQube:

-Open Terminal.
-Navigate to the bin directory[bin/] inside the SonarQube installation directory.
- Cd to your O.S
-Run the following command to start SonarQube: [./sonar.sh start].

g. Access SonarQube:

Once SonarQube is started, you can access it via a web browser at http://localhost:9000
The default credentials are admin for both the username and password. 
It is  recommended to change the password after the first login. 


2.Second Option: Using Docker Container:{ In Ec2 Instance}
.a. docker pull sonarqube
.b docker run -d --name sonarqube \
-e SONARQUBE_JDBC_USERNAME=<your_database_username> \
-e SONARQUBE_JDBC_PASSWORD=<your_database_password> \
-e SONARQUBE_JDBC_URL=jdbc:postgresql://<your_database_host>:<your_database_port>/database_name \
-p 9000:9000 sonarqube

Replace The Env Variables with your Informations

Username: postgres
Password: postgres
Database Name: Sonarqube_database_1

docker pull sonarqube
docker run -d --name sonarqube \
-e SONARQUBE_JDBC_USERNAME=postgres \
-e SONARQUBE_JDBC_PASSWORD=postgres \
-e SONARQUBE_JDBC_URL=jdbc:postgresql://database-1.c9csuwimi0a1.us-east-1.rds.amazonaws.com:5432/sonarqube_database \
-p 9000:9000 sonarqube

3. Access SonarQube in the browser 
http://<your_ubuntu_instance_ip>:9000. {It could be your server ip, ...}

4. Install The Scanner & Configure It For Your  Project Implementation.

Once the SonarQube platform has been installed, you are ready to install a scanner. 
You must install and configure the scanner that is most appropriate for your needs depending 
on your build tool. Then, you will start the analysis of your project by invoking the scanner 
in your CI pipeline after you build and before you do any sort of archiving or deployment. 
The scanner installation and invoking are explained in detail in the documentation of the 
corresponding scanner: 

Gradle - SonarScanner for Gradle
.NET - SonarScanner for .NET
Maven - SonarScanner for Maven
Jenkins - Jenkins extension for SonarQube
Azure DevOps - SonarQube Extension for Azure DevOps
Ant - SonarScanner for Ant
Anything else - SonarScanner CLI


STEPS 
You may use one of the following options:

1.You install the scanner on your CI/CD host and, when you start your first analysis,
the corresponding project is automatically created in SonarQube. 

2.You create first a project in the SonarQube UI. During the creation, you will be asked about 
the CI tool you are using and you will be guided through a tutorial to install the appropriate
scanner on your CI/CD host.
To create a project, you use the Create Project button on the Projects page, which is visible 
to users with project creation rights.

--Lets Use The First Method:
a. Install Scanner: 
 - Download The Version Of Sonar-Scanner Locally.
 - Copy The Version That Should Be Install To Ec2 or Server:
 scp -i chriskeypair.pem sonar-scanner-cli-5.0.1.3006-linux.zip ubuntu@18.234.36.20:/home/ubuntu
 -Unzip Scanner.Zip
 -Move Scanner Directory: sudo mv sonar-scanner-5.0.1.3006-linux/ /opt/sonar-scanner
 -Export Path To ~/.bashrc: vim ~/.bashrc ; export PATH=$PATH:/opt/sonar-scanner/bin;
 source ~/.bashrc

b. Create The Project Directory:
mkdir project(project_directory, it could be Anything)

c. Create For The User Token For Later Use Properties File.{ Sonarqube Browser}

d. Create File In The Root Of Project (cd ..) : vim sonar-project.properties 
(add content)

e. Run Command: sonar-scanner (To Scan The Code That Is In the file (any)The Directory That)
the file can take any extension: .Yaml, .Py, .Sh, .Tf


-- Sonarqube Deployment On Kubernetes Cluster: 

A. MINIKUBE
. open Docker Desktop(launch)
. start Your Minikube{ minikube start}.
. create Deployment.yaml, ConfigMaps.yaml , Service.yaml, PersistanceVolume.yaml 
. Deploy them(above : kubectl apply -f ....)
. Check the service on the terminal [kubectl get svc], on the browser http://$NODEPORT:$PORT

B. USING TERRAFORM TO DEPLOY THE K8S CLUSTER & DEPLOYING SONARQUBE ON IT:
{ See Sonarqube-Deployment-On-Eks-Cluster Directory }

Outlines:
1. Eks-Cluster-Deployment:see Terraform Complete Course(TIA)


a. EkS-Version (BEST-PRACTICE)

* Best Practice required the use of the Latest Version.(Eks-Version)
* If your application requires a specific version of Kubernetes, you can select older versions.
* Master Version has to be lower by 1 to the Eks-Version
* We recommend maintaining the same Kubernetes version on your Control Plane(Master) 
and Nodes.
https://docs.aws.amazon.com/eks/latest/userguide/kubernetes-versions.html
https://kubernetes.io/releases/version-skew-policy/
*

- retrieve the kubeconfig by:
Example: aws eks update-kubeconfig --name DEVOPS-BFA --region us-east-1
([After running this ]) it automatically Configure The Cluster to your AWS-CLI 

OPTION 1. Use packer to Build Bastion-Host for Connecting to the Worker node 
only on port 22. (see Terraform Project)

Add on your Cluster code your public Key block :

  remote_access {
    ec2_ssh_key = var.ec2_ssh_key
  } 
  
-Add a file .pem where your Private Key will be stored in the Bastion Host.

-Make sure you update the Worker Node(s) security groups by adding the 
Bastion-Host security group to the Existing Worker-Node Security-Group.
Therefore we should have 2 Security-Groups (Inbound,Outbound)

traffic through the Bastion-Host.
-Connect to the Bastion Host.
-Test The connection with the  Group-Node 
ssh ec2-user@<worker-node-private-ip>
ssh -i chriskeypair.pem ec2-user@10.10.1.116
P.S  
For amazon Linux image ec2-user
For Ubuntu ssh ec2-ubuntu@<worker-node-private-ip>


-On the Bastion-Host:(Manually)
 . Configure:
 aws configure 
[default]
aws_access_key_id = 
aws_secret_access_key = 
default output= Json 
. Update Config File:
aws eks update-kubeconfig --name [Cluster_name] --region [Region_name]us-east-1 
Example: aws eks update-kubeconfig --name DEVOPS-BFA --region us-east-1
([After running this ]) it automatically Configure The Cluster to your AWS-CLI 


2. Sonarqube-Deployment-On-Eks-Cluster


VIII. Integration To Github:
----------------------------

Goal: In order to maintain Code Quality & Security within our Github Repositories:

There are 3 Steps to Integrate Sonarqube with Github In order to maintain 
Code Quality & Security within our Github Repositories:

1. Create a ([GITHUB APP])in Github.Com:

- go to your account (click on your name[if personal account], or organization [if company])
- Settings:
- Developper Settings(bottom left)
- GitHub Apps.
- New GitHub App:
- Under "GitHub App name", enter a name for your app
- Optionally, under "Description", type a description of your app
- Under "Homepage URL", type the full URL to your app's website. 
If you don’t have a dedicated URL and your app's code is stored in a public repository, 
you can use that repository URL. Or, you can use the URL of the organization or user that 
owns the app: https://github.com/s5kisito 
- Optionally, under "Callback URL", enter the full URL to redirect to after a user authorizes 
the installation. http://34.194.114.151:9000/ ( we must use SONARQUBE URL)
- Optionally, to prevent user access tokens from expiring, 
deselect Expire user authorization tokens.
- Optionally, to prompt users to authorize your app when they install it, select Request 
user authorization (OAuth) during installation
-Optionally, if you want to use device flow to generate a user access token, 
select Enable Device Flow
-Optionally, under "Setup URL", enter the URL to redirect users to after they install your app. If additional setup is required after installation, 
you can use this URL to tell users what steps to take after installation.
-Optionally, if you do not want your app to receive webhook events, deselect Active. 
For example, if your app will only be used for authentication or does not need to respond 
to webhooks, deselect this option. For more information, see "Using webhooks with GitHub Apps."

- P.S ( [don’t use webhook events for Sonarqube Configuration])

Webhook URL: To improve security, webhooks, by default, are not allowed to point to the 
SonarQube server since version 8.9 LTS. Therefore, we recommend that you disable the feature.
 Unless you want to enable code scanning alerts for security vulnerabilities in GitHub, 
 you should clear the Webhook Active checkbox to silence a forthcoming deprecation warning, 
 and clear the Webhook URL and Webhook secret fields when creating your GitHub App.

-Grant The Following Repository Permissions: 

.Checks:	Read & Write
.GitHub Enterprise: Repository Metadata: Read-Only
GitHub.com: Metadata Read-Only
(this setting is automatically set by GitHub)
.Pull Requests:	Read & Write	     
                                                          . 
. For private repositories, grant the following Repository permissions: 
Permission	Access                                                                           .
Contents	  Read-Only

If setting up GitHub Authentication, in addition to the aforementioned Repository permissions,
 grant the following Account permissions: 
Permission	             Access                                                              .
Email Addresses:	       Read-Only

And grant the following Organization permissions:
Permission	Access                                                                           .
Members:	  Read-Only
Projects:	  Read-Only


FOR PRACTICE ON WEBHOOK EVENTS FOLLOW THIS: (Not In Sonarqube Please)

a.Creating a webhook URL with Smee
You can use Smee to create a unique domain where GitHub can send webhook payloads, 
without exposing your local development to the internet. Smee calls this unique domain a 
"Webhook Proxy URL." You can use Smee Webhook Proxy URL as the webhook URL for your GitHub App.

b.To use Smee to create a unique domain, go to https://smee.io and click Start a new channel.
c.On the Smee channel page, follow the instructions under "Use the CLI" to install and run the 
Smee client.

* Install Npm & Node.Js[ brew install node ],
* Export it to Path: export PATH="/opt/homebrew/bin:$PATH"
* $ npm install --global smee-client
  $smee -u https://smee.io/AiOPhFMmiLL6kIIV [ Smee webhook URL]

  http://127.0.0.1:3000 [The URL TO SEE THE EVENTS HAPPENING ON GITHUB-APP]
d.To connect your Smee webhook URL to your GitHub App, enter your unique Smee domain in the 
"Webhook URL" field on your GitHub App registration page

- Webhook Secret (highly recommended= a must in organization)
- Ssl Verification (highly recommended= a must in organization)
- Permissions: choose what suit your needs (read-only, read & write , no access)
- Subscribe to events ( your choice)
- Under "Where can this GitHub App be installed?", select Only on this account or Any account
(Private or Public Account)
- Create GitHub App.


2. Installing your ([GITHUB APP]) in your organization.

- Navigate to your account settings:

*For an app owned by a personal account, click Settings.
*For an app owned by an organization:
Click Your organizations.
To the right of the organization, click Settings.

- Developer Settings(bottom left)
- GitHub Apps(left side bar)
- Next to the GitHub App that you want to install, click Edit
- Click Install App(your [GITHUB-APP])


3. Updating Your SonarQube Global Settings With Your GitHub App Information.

-Go To Sonarqube Server:

- Administration > Configuration > General Settings > DevOps Platform Integrations> GitHub 
and specify the following settings: ([if different in your server]): just look for 
DevOps Platform Integrations> GitHub

-Configuration Name (Enterprise and Data Center Edition only): The name used to 
identify youGitHub configuration at the project level.Use something succinct and easily 
recognizable.

P.S : We must Use ([GITHUB-APP]) here in our situation

-GitHub URL: For example, https://github.company.com/api/v3 for GitHub Enterprise 
or https://api.github.com/ for GitHub.com.(public or private repository)

- App Id
- Client Id
- Client SECRET(generate it on your [GITHUB-APP])
- Private key: "value" Generate it:

IX PROJECTS ANALYSIS:
----------------------

1. Analyze your project with GitHub Actions CI

a. Create GitHub Secrets
In your GitHub repository, go to Settings > Secrets and create two new secrets:
-Click on New repository secret.
-In the Name field, enter SONAR_TOKEN
-In the Value field, enter an existing token, or a newly generated one: Generate a token
-Click on Add secret.
-Click on New repository secret.
-In the Name field, enter SONAR_HOST_URL
-In the Value field, enter http://34.194.114.151:9000 
-Click on Add secret.

b. Create Workflow YAML File
- What option best describes your build?
Maven
Gradle
.NET
Other (for JS, TS, Go, Python, PHP, ...)

- Sonar-Project.Properties (REQUIRED FOR SONARQUBE)


2. Analyze your project with Jenkins:

###########################################################################################

SONARLINT

SonarLint Connected Mode (Sonarlint Extension)

SonarLint is your first line of defense in keeping your code clean. Connected Mode binds your
SonarQube project to a local project so that SonarLint can catch issues immediately, 
right in the IDE, before you even commit them.
SonarLint is a free IDE extension that integrates with SonarQube using Connected Mode. 
Like a spell checker, SonarLint highlights issues as you type. When an issue is identified, 
SonarLint provides you with clear remediation guidance so you can fix it before the code is 
even committed. In many cases, it also provides a quick fix that can automatically fix the 
issue for you.

e.g 
INTELLIJ
VISUAL STUDIO
VS CODE

#############################################################################################

SONARCLOUD:  IAAS {Infrastructure As a Service }

I. What is Sonarcloud? 

SonarCloud is a cloud-based service designed to help developers write better code by 
continuously analyzing code quality and identifying potential issues, bugs, vulnerabilities, 
and code smells in software projects. It integrates with various version control systems and 
provides detailed reports and insights to developers, allowing them to improve their code as 
they work. In simple terms, SonarCloud acts like a helpful assistant for developers, pointing
out areas where their code can be enhanced or fixed to ensure better overall quality and 
performance of the software.



How to retrieve Aws Ami details for Packer:
------------------------------------------
------------------------------------------

 source_ami_filter {
    filters = {
      name                = "ubuntu/images/*ubuntu-jammy-22.04-amd64-server-*"
      root-device-type    = "ebs"
      virtualization-type = "hvm"
    }
 }    


2 steps:

1. Navigate 
https://us-east-1.console.aws.amazon.com/ (RECOMMENDED)

- Ec2
- Images
- Ami Catalog.( choose between Quickstart Ami, Marketplace or Community)

P.S: you will find information such as : 
Platform: ubuntu
Root Device type: ebs
Virtualization: hvm
Ena Enabled: Yes
Select(the architecture)
64-bit (x86)

2. Patch 

The Patch version can be retrieve on Marketplace :
https://aws.amazon.com/marketplace/
AWS Marketplace: Supported Images, Product Overview.
aws.amazon.com

For Example : Ubuntu 22 (Ubuntu 22.04 LTS)
Current Patch Version Ubuntu 22.04 LTS built from:

[[ubuntu/images/hvm-ssd/ubuntu-jammy-22.04-amd64-server]]

. Reminder: 
add [[*]] at the beginning and end of Patch Version.
add [[-]] before the  * at the end 


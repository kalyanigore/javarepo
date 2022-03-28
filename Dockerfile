FROM tomcat:8.1
 
ADD **/*.war /usr/local/tomcat/webapps
 
EXPOSE 9090
 
CMD ["catalina.sh", "run"]

# intel

0.  open up application.yml and change the ip address to your local ip address

1. run
docker-compose up

If you do not have java, then you can do the below:
2.  open a new terminal, run
docker build . -t intel

3.  run
docker run intel

If you have java installed, you can navigate to the target directory and do
java -jar intel-1.jar
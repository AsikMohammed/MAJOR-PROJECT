REGISTER '/home/hduser/Desktop/udf.jar';

A = LOAD 'hdfs://localhost:54310/INPUTDATA/part-m-00000' as (a:chararray,b:chararray,c:int,d:int,e:int,f:int,g:int,h:int,i:int,j:int,k:int,l:int,m:int,n:int,o:int,p:int,q:int,r:int);

B = FILTER A by udf($10,$2);

C = FOREACH B GENERATE $1;

STORE C INTO 'hdfs://localhost:54310/Question-2-OP';

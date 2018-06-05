#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  env.AWS_REGION = 'us-west-2'
  env.AWS_EC2_BASE_IMAGE = 'ami-3a3b5742'
  env.AWS_EC2_INSTANCE_PROFILE = 'cq-packer-role'
  env.AWS_VPC = 'vpc-6730b31e'
  env.AWS_VPC_SUBNET = 'subnet-b0110bf8'
  // The ID of a secret defined in jenkins holding the aws access key id and secret
  env.AWS_CREDS_JENKINS_SECRET_ID='gradle-aws-access-key'
  echo "param value in funtion is ${params.param1}"
  
}


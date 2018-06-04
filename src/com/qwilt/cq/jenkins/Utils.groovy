package com.qwilt.cq.jenkins
class Utils implements Serializable {
  def steps
  Utils(steps) {this.steps = steps}
  def echo(args) {
    steps.sh "echo 'hello NIRNIRNIR'"
  }
  
  
   def func2(args) {
     steps.sh "echo ${args}"
  }
  
  
    def func3(args) {
      steps.sh "script { func( 'sommestr') }"
    }
  
   def func4(args) {
      steps.sh " func( 'sommestr') "
    }
  
  def func5(args) {
      func( 'sommestr')
  }
  
  
}

package com.patternmatching.caseclass

object MainDemo {
  def main(args: Array[String]){
    val demo = new NotificationImp()
    val sms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    
    
    println(demo.showNotification(sms))
    println(demo.showNotification(someVoiceRecording))
    
  }
}
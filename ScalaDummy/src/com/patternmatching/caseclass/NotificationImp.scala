package com.patternmatching.caseclass

class NotificationImp {
  def showNotification(notification:Notification):String={
    notification match {
      case Email(email, title, _)=> s"You got an email from $email with title: $title"
      case SMS(number, message)=> s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) => s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
}
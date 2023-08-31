class Task(object):
   execution = ""
   def get_task(self):
      return self.execution

class Spotify(Task):
   execution = "A music task is being executed!"

class Calendar(Task):
   execution = "A calendar task is being executed!"

class Chat(Task):
   execution = "A chat task is being executed!"

class TaskFactory():
   def create_task(self, typ):
      return globals()[typ]()

task = TaskFactory()
tasks = ['Spotify', 'Calendar', 'Chat']

for t in tasks:
   print(task.create_task(t).get_task())

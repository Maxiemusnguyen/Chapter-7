/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
public class School:
        def __init__(self):
        self.students = []

        def add_student(self, student):
        self.students.append(student)

        def remove_student(self, student):
        if student in self.students:
        self.students.remove(student)
        else:
        print("Student not found in the school.")

        def find_youngest_student(self):
        if not self.students:
        return None
        youngest = min(self.students, key=lambda x: x.get_age())
        return youngest

        def find_oldest_student(self):
        if not self.students:
        return None
        oldest = max(self.students, key=lambda x: x.get_age())
        return oldest

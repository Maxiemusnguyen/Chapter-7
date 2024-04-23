/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
class Student:
        def __init__(self, id, age, gpa, credit_hours):
        self.id = id
        self.age = age
        self.gpa = gpa
        self.credit_hours = credit_hours

        # Getter methods
        def get_id(self):
        return self.id

        def get_age(self):
        return self.age

        def get_gpa(self):
        return self.gpa

        def get_credit_hours(self):
        return self.credit_hours

        # Setter methods
        def set_id(self, new_id):
        self.id = new_id

        def set_age(self, new_age):
        self.age = new_age

        def set_gpa(self, new_gpa):
        self.gpa = new_gpa

        def set_credit_hours(self, new_credit_hours):
        self.credit_hours = new_credit_hours

        # Equals method
        def equals(self, other_student):
        return self.id == other_student.id

        # toString method
        def __str__(self):
        return f"Name: {self.__class__.__name__}, ID: {self.id}"

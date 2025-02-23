class Student:
    def __init__(self, id, name, cgpa):
        self.id = id
        self.name = name
        self.cgpa = cgpa

    def __str__(self):
        return f"ID: {self.id}, Name: {self.name}, CGPA: {self.cgpa}"

class Node:
    def __init__(self, student):
        self.student = student
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    def insert(self, id, name, cgpa):
        new_student = Student(id, name, cgpa)
        if self.root is None:
            self.root = Node(new_student)
        else:
            self.recur(self.root, new_student)

    def recur(self, node, student):
        if student.id < node.student.id:
            if node.left is None:
                node.left = Node(student)
            else:
                self.recur(node.left, student)
        elif student.id > node.student.id:
            if node.right is None:
                node.right = Node(student)
            else:
                self.recur(node.right, student)
        else:
            print(f"Student with ID {student.id} already exists.")

    def search(self, id):
        return self.sear(self.root, id)

    def sear(self, node, id):
        if node is None:
            return None
        if id == node.student.id:
            return node.student
        elif id < node.student.id:
            return self.sear(node.left, id)
        else:
            return self.sear(node.right, id)

    def display(self):
        students = []
        self.dis(self.root, students)
        for student in students:
            print(student)

    def dis(self, node, students):
        if node is not None:
            self.dis(node.left, students)
            students.append(node.student)
            self.dis(node.right, students)


if __name__=='__main__':
    bst = BST()
    bst.insert(1, "Shashwat", 8.5)
    bst.insert(2, "Preetham", 7.3)

    print("\nSearch Result:")
    result = bst.search(1)  
    print(result if result else "Student not found.")

    print("\nStudent Records (Inorder Traversal):")
    bst.display()

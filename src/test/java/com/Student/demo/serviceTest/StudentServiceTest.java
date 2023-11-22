package com.Student.demo.serviceTest;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.Student.demo.entity.Student;
import com.Student.demo.repository.StudentRepository;
import com.Student.demo.service.StudentService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    public void testGetAllStudents() {
        Mockito.when(studentRepository.findAll()).thenReturn(Arrays.asList(
                new Student(1L, "Asish Mohanty", 25, 50000.0),
                new Student(2L, "Asish Mohanty", 22, 60000.0)
        ));

        assertEquals(2, studentService.getAllStudents().size());
    }

    @Test
    public void testGetStudentById() {
        Mockito.when(studentRepository.findById(1L)).thenReturn(
                Optional.of(new Student(1L, "Asish Mohanty", 25, 50000.0))
        );

        assertEquals("Asish Mohanty", studentService.getStudentById(1L).get().getName());
    }

    @Test
    public void testSaveStudent() {
        Student newStudent = new Student(null, "Asish Mohanty", 22, 60000.0);

        Mockito.when(studentRepository.save(newStudent)).thenReturn(
                new Student(3L, "Asish Mohanty", 22, 60000.0)
        );

        Student savedStudent = studentService.saveStudent(newStudent);

        assertEquals(3L, savedStudent.getId());
        assertEquals("Asish Mohanty", savedStudent.getName());
    }

    @Test
    public void testDeleteStudent() {
        Mockito.doNothing().when(studentRepository).deleteById(3L);

        assertThrows(RuntimeException.class, () -> studentService.deleteStudent(3L));
    }
}


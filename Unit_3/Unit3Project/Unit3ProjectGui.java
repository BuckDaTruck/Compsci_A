
/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * Description: Unit 3 project to summarize text difficulty and reading level.
 * Note: Not to be used as submission for project grade, external tools were used.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Unit3ProjectGui extends JFrame implements DropTargetListener {
    static int kindergartenCount = 0;
    static int elementaryCount = 0;
    static int middleSchoolCount = 0;
    static int highSchoolCount = 0;
    static int advancedCount = 0;
    static double totalCount = 0;
    static double totalWords = 0;
    static String kindergartenWords = "";
    static String elementaryWords = "";
    static String middleSchoolWords = "";
    static String highSchoolWords = "";
    static String advancedWords = "";
    private JLabel fileNameLabel;
    private JTextField fileNameField;
    private JButton analyzeButton;
    private JButton saveButton;
    private JTextArea outputArea;

    public Unit3ProjectGui() {
        super("Text Difficulty Analyzer");

        // Set up the GUI components
        fileNameLabel = new JLabel("Enter the file name:");
        fileNameField = new JTextField(20);
        analyzeButton = new JButton("Analyze");
        saveButton = new JButton("Save");
        outputArea = new JTextArea(20, 40);
        outputArea.setEditable(false);

        // Add the components to the GUI
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(fileNameLabel);
        inputPanel.add(fileNameField);
        inputPanel.add(analyzeButton);
        inputPanel.add(saveButton);

        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(outputScrollPane, BorderLayout.CENTER);

        // Add action listeners to the GUI components
        analyzeButton.addActionListener(e -> analyzeText());
        saveButton.addActionListener(e -> saveOutput());

        // Add drag and drop support to the file name field
        fileNameField.setDropTarget(new DropTarget(fileNameField, DnDConstants.ACTION_COPY_OR_MOVE, this));

        // Set up the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void dragEnter(DropTargetDragEvent e) {
        e.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE);
    }

    public void dragExit(DropTargetEvent e) {
    }

    public void dragOver(DropTargetDragEvent e) {
    }

    public void drop(DropTargetDropEvent e) {
        e.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
        Transferable transferable = e.getTransferable();
        if (transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            try {
                List<File> files = (List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                if (files.size() > 0) {
                    fileNameField.setText(files.get(0).getAbsolutePath());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void dropActionChanged(DropTargetDragEvent e) {
    }

    private void analyzeText() {
        String fileName = fileNameField.getText();
        String text = textToString(fileName);
        outputArea.setText("");
        outputArea.append("-----------------Original Text:-----------------\n");
        outputArea.append(text + "\n");
        sort(text);
        outputArea.append("-------------------Level Breakdowns-------------------\n");
        outputArea.append("Kindergarten-Level words: " + kindergartenCount + "\n");
        outputArea.append("Elementary-Level words: " + elementaryCount + "\n");
        outputArea.append("Middle-School-Level words: " + middleSchoolCount + "\n");
        outputArea.append("High-School-Level words: " + highSchoolCount + "\n");
        outputArea.append("Advanced-Level words: " + advancedCount + "\n");
        outputArea.append("-------------------Words In Each Category -------------------\n");
        outputArea.append("-------Kindergarten-Level words:-------\n");
        outputArea.append(kindergartenWords + "\n");
        outputArea.append("-------Elementary-Level words:-------\n");
        outputArea.append(elementaryWords + "\n");
        outputArea.append("-------Middle-School-Level words:-------\n");
        outputArea.append(middleSchoolWords + "\n");
        outputArea.append("-------High-School-Level words:-------\n");
        outputArea.append(highSchoolWords + "\n");
        outputArea.append("-------Advanced-Level words:-------\n");
        outputArea.append(advancedWords + "\n");
        outputArea.append("Total words: " + totalWords + "\n");
        outputArea.append("Total Characters: " + totalCount + "\n");
        double averageLength = totalCount / totalWords;
        String readingLevel = "";
        if (averageLength <= 4) {
            readingLevel = "kindergarten";
        } else if (averageLength <= 6) {
            readingLevel = "elementary";
        } else if (averageLength <= 10) {
            readingLevel = "middle school";
        } else if (averageLength <= 14) {
            readingLevel = "high school";
        } else {
            readingLevel = "advanced";
        }
        outputArea.append("-------------------Reading Level-------------------\n");
        outputArea.append(String.format(
                "The average word length in this text is %.2f letters, so it appears to be of %s reading level\n",
                averageLength, readingLevel));
    }

    private void saveOutput() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(outputArea.getText());
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }

        return temp.trim();
    }

    public static void sort(String text) {
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char start = text.charAt(i);
            if (Character.isLetterOrDigit(start)) {
                word += start;

            } else {
                if (word.length() > 0) {
                    totalWords++;
                    totalCount += word.length();
                    if (word.length() <= 4) {
                        kindergartenCount++;
                        kindergartenWords = kindergartenWords + word + " ";
                    } else if (word.length() <= 6) {
                        elementaryCount++;
                        elementaryWords = elementaryWords + word + " ";
                    } else if (word.length() <= 10) {
                        middleSchoolCount++;
                        middleSchoolWords = middleSchoolWords + word + " ";
                    } else if (word.length() <= 14) {
                        highSchoolCount++;
                        highSchoolWords = highSchoolWords + word + " ";
                    } else {
                        advancedCount++;
                        advancedWords = advancedWords + word + " ";
                    }
                }
                word = "";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Unit3ProjectGui();
        });
    }
}
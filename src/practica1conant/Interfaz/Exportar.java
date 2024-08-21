/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1conant.Interfaz;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 *
 * @author DAVID
 */
public class Exportar {
    
    public void exportarCanvasConJFileChooser(Canvas canvas) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar como");

        // Filtros para PNG y PDF
        FileNameExtensionFilter pngFilter = new FileNameExtensionFilter("PNG Image", "png");
        FileNameExtensionFilter pdfFilter = new FileNameExtensionFilter("PDF Document", "pdf");
        fileChooser.addChoosableFileFilter(pngFilter);
        fileChooser.addChoosableFileFilter(pdfFilter);

        fileChooser.setAcceptAllFileFilterUsed(false);  // Deshabilitar "Todos los archivos"

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String extension = "";

            // Determina el formato basado en la extensión seleccionada
            if (fileChooser.getFileFilter() == pngFilter) {
                extension = "png";
            } else if (fileChooser.getFileFilter() == pdfFilter) {
                extension = "pdf";
            }

            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith("." + extension)) {
                filePath += "." + extension;
            }

            // Llama al método correspondiente para exportar
            if ("png".equals(extension)) {
                exportarCanvasComoPNG(canvas, filePath);
            } else if ("pdf".equals(extension)) {
                exportarCanvasComoPDF(canvas, filePath);
            }
        }
        
    }
    
    public void exportarCanvasComoPDF(Canvas canvas, String filePath) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        canvas.paint(g2);
        g2.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
            baos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Document document = new Document();
        
        try {
            PdfWriter.getInstance((com.itextpdf.text.Document) document, new FileOutputStream(filePath));
            document.open();
            Image pdfImage = Image.getInstance(baos.toByteArray());
            pdfImage.scaleToFit(width, height);
            document.add(pdfImage);
            document.close();
            System.out.println("Exportado como PDF en: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exportarCanvasComoPNG(Canvas canvas, String filePath) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        canvas.paint(g2);
        g2.dispose();

        try {
            ImageIO.write(image, "png", new File(filePath));
            System.out.println("Exportado como PNG en: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}

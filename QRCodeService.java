@Service
public class QRCodeService {

    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    public String generateQRCodeImage(String text, int width, int height) throws Exception {
        BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(QR_CODE_IMAGE_PATH);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

        return QR_CODE_IMAGE_PATH;
    }
}

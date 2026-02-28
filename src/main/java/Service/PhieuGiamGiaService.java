package Service;

import Repository.LoaiPhieuGiamGiaRepository;
import Repository.PhieuGiamGiaRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PhieuGiamGia", value = {"/phieu-giam-gia/hien-thi","/phieu-giam-gia/add","/phieu-giam-gia/remove"})
public class PhieuGiamGiaService extends HttpServlet {
    PhieuGiamGiaRepository phgr = new PhieuGiamGiaRepository();
    LoaiPhieuGiamGiaRepository lphgr = new LoaiPhieuGiamGiaRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")){
            req.setAttribute("phgr", phgr.getAll());
            req.setAttribute("lphgr", lphgr.getAll());
            req.getRequestDispatcher("/view.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

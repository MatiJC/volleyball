package com.maticuad.volleyballApp.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter { //extends OncePerRequestFilter

//    private final JwtService jwtService;
//    private final UserDetailsService userDetailsService;
//    private final TokenRepository tokenRepository;
//
//    @Override
//    protected void doFilterInternal(@NonNull HttpServletRequest request,
//                                    @NonNull HttpServletResponse response,
//                                    @NonNull FilterChain filterChain
//    ) throws ServletException, IOException {
//        if (request.getServletPath().contains("/api/v1/auth")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//        String authHeader = request.getHeader("Authorization");
//        String jwt;
//        String username;
//        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//        jwt = authHeader.substring(7);
//        username = jwtService.extractUsername(jwt);
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//            boolean isTokenValid = tokenRepository.findByToken(jwt).map(token ->
//                    !token.isExpired() && !token.isRevoked()).orElse(false);
//            if (jwtService.isTokenValid(jwt, userDetails) && isTokenValid) {
//                UsernamePasswordAuthenticationToken authToken = new
//                        UsernamePasswordAuthenticationToken(userDetails,
//                        null,
//                        userDetails.getAuthorities());
//                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authToken);
//            }
//            filterChain.doFilter(request, response);
//        }
//    }
}
